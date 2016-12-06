package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleBFO_0000050Iterator theAcademicArticleBFO_0000050Iterator = (AcademicArticleBFO_0000050Iterator)findAncestorWithClass(this, AcademicArticleBFO_0000050Iterator.class);
			pageContext.getOut().print(theAcademicArticleBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

