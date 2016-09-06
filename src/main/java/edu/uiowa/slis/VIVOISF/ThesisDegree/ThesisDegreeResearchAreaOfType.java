package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeResearchAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeResearchAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeResearchAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeResearchAreaOfIterator theThesisDegreeResearchAreaOfIterator = (ThesisDegreeResearchAreaOfIterator)findAncestorWithClass(this, ThesisDegreeResearchAreaOfIterator.class);
			pageContext.getOut().print(theThesisDegreeResearchAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

