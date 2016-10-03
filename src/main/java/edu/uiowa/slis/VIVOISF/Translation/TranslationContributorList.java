package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationContributorListIterator theTranslationContributorListIterator = (TranslationContributorListIterator)findAncestorWithClass(this, TranslationContributorListIterator.class);
			pageContext.getOut().print(theTranslationContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

