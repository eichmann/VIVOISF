package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyRO_0000056Iterator theCaseStudyRO_0000056Iterator = (CaseStudyRO_0000056Iterator)findAncestorWithClass(this, CaseStudyRO_0000056Iterator.class);
			pageContext.getOut().print(theCaseStudyRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

