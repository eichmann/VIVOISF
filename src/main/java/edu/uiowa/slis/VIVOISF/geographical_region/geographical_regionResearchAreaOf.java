package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionResearchAreaOfIterator thegeographical_regionResearchAreaOfIterator = (geographical_regionResearchAreaOfIterator)findAncestorWithClass(this, geographical_regionResearchAreaOfIterator.class);
			pageContext.getOut().print(thegeographical_regionResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

