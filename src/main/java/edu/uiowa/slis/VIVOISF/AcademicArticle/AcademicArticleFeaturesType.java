package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleFeaturesIterator theAcademicArticleFeaturesIterator = (AcademicArticleFeaturesIterator)findAncestorWithClass(this, AcademicArticleFeaturesIterator.class);
			pageContext.getOut().print(theAcademicArticleFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for features tag ");
		}
		return SKIP_BODY;
	}
}

