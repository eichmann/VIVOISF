package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyERO_0000045Iterator theCaseStudy = (CaseStudyERO_0000045Iterator)findAncestorWithClass(this, CaseStudyERO_0000045Iterator.class);
			pageContext.getOut().print(theCaseStudy.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

