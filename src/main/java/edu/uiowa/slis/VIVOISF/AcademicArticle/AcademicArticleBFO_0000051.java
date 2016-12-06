package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleBFO_0000051Iterator theAcademicArticleBFO_0000051Iterator = (AcademicArticleBFO_0000051Iterator)findAncestorWithClass(this, AcademicArticleBFO_0000051Iterator.class);
			pageContext.getOut().print(theAcademicArticleBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

