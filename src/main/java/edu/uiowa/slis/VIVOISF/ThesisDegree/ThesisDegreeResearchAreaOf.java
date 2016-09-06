package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeResearchAreaOfIterator theThesisDegreeResearchAreaOfIterator = (ThesisDegreeResearchAreaOfIterator)findAncestorWithClass(this, ThesisDegreeResearchAreaOfIterator.class);
			pageContext.getOut().print(theThesisDegreeResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

