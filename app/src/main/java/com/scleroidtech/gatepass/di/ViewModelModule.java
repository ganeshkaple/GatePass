package com.scleroidtech.gatepass.di;

import android.arch.lifecycle.ViewModelProvider;

import com.scleroidtech.gatepass.utils.ViewModelFactory;

import dagger.Binds;
import dagger.Module;

/**
 * Copyright (C) 2018
 *
 * @author Ganesh Kaple
 * @since 4/6/18
 */

@Module
public abstract class ViewModelModule {

	/*//TODO Need to work on this
	@Binds
	@IntoMap
	@ViewModelKey(CustomerViewModel.class)
	abstract ViewModel bindCustomerViewModel(CustomerViewModel userViewModel);

	@Binds
	@IntoMap
	@ViewModelKey(ExpenseViewModel.class)
	abstract ViewModel bindExpenseViewModel(ExpenseViewModel expenseViewModel);

	@Binds
	@IntoMap
	@ViewModelKey(LoanDetailsViewModel.class)
	abstract ViewModel bindLoanDetailsViewModel(LoanDetailsViewModel loanDetailsViewModel);

	@Binds
	@IntoMap
	@ViewModelKey(PeopleViewModel.class)
	abstract ViewModel bindPeopleViewModel(PeopleViewModel peopleViewModel);

	@Binds
	@IntoMap
	@ViewModelKey(DashboardViewModel.class)
	abstract ViewModel bindDashboardViewModel(DashboardViewModel dashboardViewModel);

	@Binds
	@IntoMap
	@ViewModelKey(PassbookViewModel.class)
	abstract ViewModel bindPassbookViewModel(PassbookViewModel passbookViewModel);
*/

	@Binds
	abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
