package pl.stepwise.protostuff

import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.psi.KtFile


private const val CONTEXT_MENU_TEXT = "Generate Protostuff Tags"
private const val FAMILY_NAME = "Protostuff"

//TODO: implement generation logic
class ProtostuffTagGenerator : PsiElementBaseIntentionAction(), IntentionAction {

    override fun getText() = CONTEXT_MENU_TEXT
    override fun getFamilyName() = FAMILY_NAME

    override fun isAvailable(project: Project, editor: Editor, element: PsiElement) =
        element.containingFile is KtFile

    override fun invoke(project: Project, editor: Editor, element: PsiElement) {
        TODO()
    }
}