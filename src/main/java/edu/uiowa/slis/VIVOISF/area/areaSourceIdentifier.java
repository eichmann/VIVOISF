package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaSourceIdentifierIterator thearea = (areaSourceIdentifierIterator)findAncestorWithClass(this, areaSourceIdentifierIterator.class);
			pageContext.getOut().print(thearea.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing area for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

