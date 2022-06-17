package com.github.kaydunovdenis.springsupplier.util;

import com.github.kaydunovdenis.springsupplier.entity.Supplier;

public class SupplierConverter {

    private SupplierConverter() {
    }

    public static void updateSupplier(Supplier supplier, Supplier supplierToUpdate) {
        supplierToUpdate.setName(supplier.getName());
        supplierToUpdate.setAddress(supplier.getAddress());
        supplierToUpdate.setOrders(supplier.getOrders());
        supplierToUpdate.setRecipients(supplier.getRecipients());
    }
}