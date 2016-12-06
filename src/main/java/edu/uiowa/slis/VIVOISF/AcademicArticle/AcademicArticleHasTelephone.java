package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasTelephoneIterator theAcademicArticleHasTelephoneIterator = (AcademicArticleHasTelephoneIterator)findAncestorWithClass(this, AcademicArticleHasTelephoneIterator.class);
			pageContext.getOut().print(theAcademicArticleHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

