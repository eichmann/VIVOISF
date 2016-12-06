package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasResearchAreaIterator theareaHasResearchAreaIterator = (areaHasResearchAreaIterator)findAncestorWithClass(this, areaHasResearchAreaIterator.class);
			pageContext.getOut().print(theareaHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

