package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaSourceModifiedIterator thearea = (areaSourceModifiedIterator)findAncestorWithClass(this, areaSourceModifiedIterator.class);
			pageContext.getOut().print(thearea.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing area for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

