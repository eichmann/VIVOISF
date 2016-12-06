package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasNameIterator theareaHasNameIterator = (areaHasNameIterator)findAncestorWithClass(this, areaHasNameIterator.class);
			pageContext.getOut().print(theareaHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasName tag ");
		}
		return SKIP_BODY;
	}
}

