package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyARG_0000001Iterator theCaseStudy = (CaseStudyARG_0000001Iterator)findAncestorWithClass(this, CaseStudyARG_0000001Iterator.class);
			pageContext.getOut().print(theCaseStudy.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

