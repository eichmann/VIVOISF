package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationContributorListIterator theTranslationContributorListIterator = (TranslationContributorListIterator)findAncestorWithClass(this, TranslationContributorListIterator.class);
			pageContext.getOut().print(theTranslationContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

