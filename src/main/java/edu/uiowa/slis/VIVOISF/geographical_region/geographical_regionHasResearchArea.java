package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasResearchAreaIterator thegeographical_regionHasResearchAreaIterator = (geographical_regionHasResearchAreaIterator)findAncestorWithClass(this, geographical_regionHasResearchAreaIterator.class);
			pageContext.getOut().print(thegeographical_regionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

