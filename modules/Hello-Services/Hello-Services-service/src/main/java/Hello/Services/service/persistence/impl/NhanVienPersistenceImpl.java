/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package Hello.Services.service.persistence.impl;

import Hello.Services.exception.NoSuchNhanVienException;

import Hello.Services.model.NhanVien;
import Hello.Services.model.impl.NhanVienImpl;
import Hello.Services.model.impl.NhanVienModelImpl;

import Hello.Services.service.persistence.NhanVienPersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the nhan vien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NhanVienPersistence
 * @see Hello.Services.service.persistence.NhanVienUtil
 * @generated
 */
@ProviderType
public class NhanVienPersistenceImpl extends BasePersistenceImpl<NhanVien>
	implements NhanVienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NhanVienUtil} to access the nhan vien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NhanVienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			NhanVienModelImpl.UUID_COLUMN_BITMASK |
			NhanVienModelImpl.TENNV_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the nhan viens where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid(String uuid, int start, int end,
		OrderByComparator<NhanVien> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the nhan viens where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid(String uuid, int start, int end,
		OrderByComparator<NhanVien> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<NhanVien> list = null;

		if (retrieveFromCache) {
			list = (List<NhanVien>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NhanVien nhanVien : list) {
					if (!Objects.equals(uuid, nhanVien.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws NoSuchNhanVienException if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien findByUuid_First(String uuid,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByUuid_First(uuid, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByUuid_First(String uuid,
		OrderByComparator<NhanVien> orderByComparator) {
		List<NhanVien> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws NoSuchNhanVienException if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien findByUuid_Last(String uuid,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByUuid_Last(uuid, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByUuid_Last(String uuid,
		OrderByComparator<NhanVien> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param Id the primary key of the current nhan vien
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien[] findByUuid_PrevAndNext(long Id, String uuid,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByUuid_PrevAndNext(session, nhanVien, uuid,
					orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByUuid_PrevAndNext(session, nhanVien, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByUuid_PrevAndNext(Session session,
		NhanVien nhanVien, String uuid,
		OrderByComparator<NhanVien> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (NhanVien nhanVien : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching nhan viens
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "nhanVien.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "nhanVien.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(nhanVien.uuid IS NULL OR nhanVien.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			NhanVienModelImpl.UUID_COLUMN_BITMASK |
			NhanVienModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the nhan vien where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchNhanVienException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching nhan vien
	 * @throws NoSuchNhanVienException if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien findByUUID_G(String uuid, long groupId)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByUUID_G(uuid, groupId);

		if (nhanVien == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchNhanVienException(msg.toString());
		}

		return nhanVien;
	}

	/**
	 * Returns the nhan vien where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the nhan vien where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof NhanVien) {
			NhanVien nhanVien = (NhanVien)result;

			if (!Objects.equals(uuid, nhanVien.getUuid()) ||
					(groupId != nhanVien.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<NhanVien> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					NhanVien nhanVien = list.get(0);

					result = nhanVien;

					cacheResult(nhanVien);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (NhanVien)result;
		}
	}

	/**
	 * Removes the nhan vien where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the nhan vien that was removed
	 */
	@Override
	public NhanVien removeByUUID_G(String uuid, long groupId)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = findByUUID_G(uuid, groupId);

		return remove(nhanVien);
	}

	/**
	 * Returns the number of nhan viens where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching nhan viens
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "nhanVien.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "nhanVien.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(nhanVien.uuid IS NULL OR nhanVien.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "nhanVien.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			NhanVienModelImpl.UUID_COLUMN_BITMASK |
			NhanVienModelImpl.COMPANYID_COLUMN_BITMASK |
			NhanVienModelImpl.TENNV_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<NhanVien> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<NhanVien> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<NhanVien> list = null;

		if (retrieveFromCache) {
			list = (List<NhanVien>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NhanVien nhanVien : list) {
					if (!Objects.equals(uuid, nhanVien.getUuid()) ||
							(companyId != nhanVien.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws NoSuchNhanVienException if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator) {
		List<NhanVien> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws NoSuchNhanVienException if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param Id the primary key of the current nhan vien
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien[] findByUuid_C_PrevAndNext(long Id, String uuid,
		long companyId, OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, nhanVien, uuid,
					companyId, orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByUuid_C_PrevAndNext(session, nhanVien, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByUuid_C_PrevAndNext(Session session,
		NhanVien nhanVien, String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (NhanVien nhanVien : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching nhan viens
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "nhanVien.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "nhanVien.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(nhanVien.uuid IS NULL OR nhanVien.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "nhanVien.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GIOITINH = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGioiTinh",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIOITINH =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGioiTinh",
			new String[] { Boolean.class.getName() },
			NhanVienModelImpl.GIOITINH_COLUMN_BITMASK |
			NhanVienModelImpl.TENNV_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GIOITINH = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGioiTinh",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the nhan viens where GioiTinh = &#63;.
	 *
	 * @param GioiTinh the gioi tinh
	 * @return the matching nhan viens
	 */
	@Override
	public List<NhanVien> findByGioiTinh(boolean GioiTinh) {
		return findByGioiTinh(GioiTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the nhan viens where GioiTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param GioiTinh the gioi tinh
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByGioiTinh(boolean GioiTinh, int start, int end) {
		return findByGioiTinh(GioiTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where GioiTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param GioiTinh the gioi tinh
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByGioiTinh(boolean GioiTinh, int start, int end,
		OrderByComparator<NhanVien> orderByComparator) {
		return findByGioiTinh(GioiTinh, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the nhan viens where GioiTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param GioiTinh the gioi tinh
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching nhan viens
	 */
	@Override
	public List<NhanVien> findByGioiTinh(boolean GioiTinh, int start, int end,
		OrderByComparator<NhanVien> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIOITINH;
			finderArgs = new Object[] { GioiTinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GIOITINH;
			finderArgs = new Object[] { GioiTinh, start, end, orderByComparator };
		}

		List<NhanVien> list = null;

		if (retrieveFromCache) {
			list = (List<NhanVien>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NhanVien nhanVien : list) {
					if ((GioiTinh != nhanVien.isGioiTinh())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			query.append(_FINDER_COLUMN_GIOITINH_GIOITINH_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(GioiTinh);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where GioiTinh = &#63;.
	 *
	 * @param GioiTinh the gioi tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws NoSuchNhanVienException if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien findByGioiTinh_First(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByGioiTinh_First(GioiTinh, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("GioiTinh=");
		msg.append(GioiTinh);

		msg.append("}");

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where GioiTinh = &#63;.
	 *
	 * @param GioiTinh the gioi tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByGioiTinh_First(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator) {
		List<NhanVien> list = findByGioiTinh(GioiTinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where GioiTinh = &#63;.
	 *
	 * @param GioiTinh the gioi tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws NoSuchNhanVienException if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien findByGioiTinh_Last(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByGioiTinh_Last(GioiTinh, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("GioiTinh=");
		msg.append(GioiTinh);

		msg.append("}");

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where GioiTinh = &#63;.
	 *
	 * @param GioiTinh the gioi tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 */
	@Override
	public NhanVien fetchByGioiTinh_Last(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator) {
		int count = countByGioiTinh(GioiTinh);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByGioiTinh(GioiTinh, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where GioiTinh = &#63;.
	 *
	 * @param Id the primary key of the current nhan vien
	 * @param GioiTinh the gioi tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien[] findByGioiTinh_PrevAndNext(long Id, boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByGioiTinh_PrevAndNext(session, nhanVien, GioiTinh,
					orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByGioiTinh_PrevAndNext(session, nhanVien, GioiTinh,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByGioiTinh_PrevAndNext(Session session,
		NhanVien nhanVien, boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		query.append(_FINDER_COLUMN_GIOITINH_GIOITINH_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(GioiTinh);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where GioiTinh = &#63; from the database.
	 *
	 * @param GioiTinh the gioi tinh
	 */
	@Override
	public void removeByGioiTinh(boolean GioiTinh) {
		for (NhanVien nhanVien : findByGioiTinh(GioiTinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where GioiTinh = &#63;.
	 *
	 * @param GioiTinh the gioi tinh
	 * @return the number of matching nhan viens
	 */
	@Override
	public int countByGioiTinh(boolean GioiTinh) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GIOITINH;

		Object[] finderArgs = new Object[] { GioiTinh };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			query.append(_FINDER_COLUMN_GIOITINH_GIOITINH_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(GioiTinh);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GIOITINH_GIOITINH_2 = "nhanVien.GioiTinh = ?";

	public NhanVienPersistenceImpl() {
		setModelClass(NhanVien.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the nhan vien in the entity cache if it is enabled.
	 *
	 * @param nhanVien the nhan vien
	 */
	@Override
	public void cacheResult(NhanVien nhanVien) {
		entityCache.putResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienImpl.class, nhanVien.getPrimaryKey(), nhanVien);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { nhanVien.getUuid(), nhanVien.getGroupId() }, nhanVien);

		nhanVien.resetOriginalValues();
	}

	/**
	 * Caches the nhan viens in the entity cache if it is enabled.
	 *
	 * @param nhanViens the nhan viens
	 */
	@Override
	public void cacheResult(List<NhanVien> nhanViens) {
		for (NhanVien nhanVien : nhanViens) {
			if (entityCache.getResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
						NhanVienImpl.class, nhanVien.getPrimaryKey()) == null) {
				cacheResult(nhanVien);
			}
			else {
				nhanVien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nhan viens.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NhanVienImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nhan vien.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NhanVien nhanVien) {
		entityCache.removeResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienImpl.class, nhanVien.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((NhanVienModelImpl)nhanVien, true);
	}

	@Override
	public void clearCache(List<NhanVien> nhanViens) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NhanVien nhanVien : nhanViens) {
			entityCache.removeResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
				NhanVienImpl.class, nhanVien.getPrimaryKey());

			clearUniqueFindersCache((NhanVienModelImpl)nhanVien, true);
		}
	}

	protected void cacheUniqueFindersCache(NhanVienModelImpl nhanVienModelImpl) {
		Object[] args = new Object[] {
				nhanVienModelImpl.getUuid(), nhanVienModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			nhanVienModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		NhanVienModelImpl nhanVienModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					nhanVienModelImpl.getUuid(), nhanVienModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((nhanVienModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					nhanVienModelImpl.getOriginalUuid(),
					nhanVienModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	 *
	 * @param Id the primary key for the new nhan vien
	 * @return the new nhan vien
	 */
	@Override
	public NhanVien create(long Id) {
		NhanVien nhanVien = new NhanVienImpl();

		nhanVien.setNew(true);
		nhanVien.setPrimaryKey(Id);

		String uuid = PortalUUIDUtil.generate();

		nhanVien.setUuid(uuid);

		nhanVien.setCompanyId(companyProvider.getCompanyId());

		return nhanVien;
	}

	/**
	 * Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the nhan vien
	 * @return the nhan vien that was removed
	 * @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien remove(long Id) throws NoSuchNhanVienException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nhan vien
	 * @return the nhan vien that was removed
	 * @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien remove(Serializable primaryKey)
		throws NoSuchNhanVienException {
		Session session = null;

		try {
			session = openSession();

			NhanVien nhanVien = (NhanVien)session.get(NhanVienImpl.class,
					primaryKey);

			if (nhanVien == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNhanVienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhanVien);
		}
		catch (NoSuchNhanVienException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected NhanVien removeImpl(NhanVien nhanVien) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhanVien)) {
				nhanVien = (NhanVien)session.get(NhanVienImpl.class,
						nhanVien.getPrimaryKeyObj());
			}

			if (nhanVien != null) {
				session.delete(nhanVien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhanVien != null) {
			clearCache(nhanVien);
		}

		return nhanVien;
	}

	@Override
	public NhanVien updateImpl(NhanVien nhanVien) {
		boolean isNew = nhanVien.isNew();

		if (!(nhanVien instanceof NhanVienModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(nhanVien.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(nhanVien);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in nhanVien proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NhanVien implementation " +
				nhanVien.getClass());
		}

		NhanVienModelImpl nhanVienModelImpl = (NhanVienModelImpl)nhanVien;

		if (Validator.isNull(nhanVien.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			nhanVien.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (nhanVien.getCreateDate() == null)) {
			if (serviceContext == null) {
				nhanVien.setCreateDate(now);
			}
			else {
				nhanVien.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!nhanVienModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				nhanVien.setModifiedDate(now);
			}
			else {
				nhanVien.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (nhanVien.isNew()) {
				session.save(nhanVien);

				nhanVien.setNew(false);
			}
			else {
				nhanVien = (NhanVien)session.merge(nhanVien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!NhanVienModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { nhanVienModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					nhanVienModelImpl.getUuid(),
					nhanVienModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { nhanVienModelImpl.isGioiTinh() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GIOITINH, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIOITINH,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { nhanVienModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { nhanVienModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhanVienModelImpl.getOriginalUuid(),
						nhanVienModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						nhanVienModelImpl.getUuid(),
						nhanVienModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIOITINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhanVienModelImpl.getOriginalGioiTinh()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GIOITINH, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIOITINH,
					args);

				args = new Object[] { nhanVienModelImpl.isGioiTinh() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GIOITINH, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GIOITINH,
					args);
			}
		}

		entityCache.putResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienImpl.class, nhanVien.getPrimaryKey(), nhanVien, false);

		clearUniqueFindersCache(nhanVienModelImpl, false);
		cacheUniqueFindersCache(nhanVienModelImpl);

		nhanVien.resetOriginalValues();

		return nhanVien;
	}

	/**
	 * Returns the nhan vien with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhan vien
	 * @return the nhan vien
	 * @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNhanVienException {
		NhanVien nhanVien = fetchByPrimaryKey(primaryKey);

		if (nhanVien == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNhanVienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhanVien;
	}

	/**
	 * Returns the nhan vien with the primary key or throws a {@link NoSuchNhanVienException} if it could not be found.
	 *
	 * @param Id the primary key of the nhan vien
	 * @return the nhan vien
	 * @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien findByPrimaryKey(long Id) throws NoSuchNhanVienException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhan vien
	 * @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
				NhanVienImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		NhanVien nhanVien = (NhanVien)serializable;

		if (nhanVien == null) {
			Session session = null;

			try {
				session = openSession();

				nhanVien = (NhanVien)session.get(NhanVienImpl.class, primaryKey);

				if (nhanVien != null) {
					cacheResult(nhanVien);
				}
				else {
					entityCache.putResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
						NhanVienImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
					NhanVienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhanVien;
	}

	/**
	 * Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the nhan vien
	 * @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	 */
	@Override
	public NhanVien fetchByPrimaryKey(long Id) {
		return fetchByPrimaryKey((Serializable)Id);
	}

	@Override
	public Map<Serializable, NhanVien> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, NhanVien> map = new HashMap<Serializable, NhanVien>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			NhanVien nhanVien = fetchByPrimaryKey(primaryKey);

			if (nhanVien != null) {
				map.put(primaryKey, nhanVien);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
					NhanVienImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (NhanVien)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_NHANVIEN_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (NhanVien nhanVien : (List<NhanVien>)q.list()) {
				map.put(nhanVien.getPrimaryKeyObj(), nhanVien);

				cacheResult(nhanVien);

				uncachedPrimaryKeys.remove(nhanVien.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
					NhanVienImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the nhan viens.
	 *
	 * @return the nhan viens
	 */
	@Override
	public List<NhanVien> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of nhan viens
	 */
	@Override
	public List<NhanVien> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nhan viens
	 */
	@Override
	public List<NhanVien> findAll(int start, int end,
		OrderByComparator<NhanVien> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the nhan viens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of nhan viens
	 */
	@Override
	public List<NhanVien> findAll(int start, int end,
		OrderByComparator<NhanVien> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<NhanVien> list = null;

		if (retrieveFromCache) {
			list = (List<NhanVien>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NHANVIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHANVIEN;

				if (pagination) {
					sql = sql.concat(NhanVienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the nhan viens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NhanVien nhanVien : findAll()) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens.
	 *
	 * @return the number of nhan viens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NHANVIEN);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NhanVienModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the nhan vien persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(NhanVienImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_NHANVIEN = "SELECT nhanVien FROM NhanVien nhanVien";
	private static final String _SQL_SELECT_NHANVIEN_WHERE_PKS_IN = "SELECT nhanVien FROM NhanVien nhanVien WHERE Id IN (";
	private static final String _SQL_SELECT_NHANVIEN_WHERE = "SELECT nhanVien FROM NhanVien nhanVien WHERE ";
	private static final String _SQL_COUNT_NHANVIEN = "SELECT COUNT(nhanVien) FROM NhanVien nhanVien";
	private static final String _SQL_COUNT_NHANVIEN_WHERE = "SELECT COUNT(nhanVien) FROM NhanVien nhanVien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhanVien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NhanVien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NhanVien exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(NhanVienPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}