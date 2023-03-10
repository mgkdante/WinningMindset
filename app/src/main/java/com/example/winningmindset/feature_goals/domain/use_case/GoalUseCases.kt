package com.example.winningmindset.feature_goals.domain.use_case

data class GoalUseCases(
    val getGoalsWithMilestones: GetGoalsWithMilestones,
    val getGoalWithMilestones: GetGoalWithMileStones,
    val addGoalWithMilestones: AddGoalWithMilestones,
    val deleteGoal: DeleteGoal,
    val addMilestoneList: AddMilestoneList,
    val updateGoal: UpdateGoal,
)
