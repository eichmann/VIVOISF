package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumOwnerInverseIterator theMuseumOwnerInverseIterator = (MuseumOwnerInverseIterator)findAncestorWithClass(this, MuseumOwnerInverseIterator.class);
			pageContext.getOut().print(theMuseumOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for owner tag ");
		}
		return SKIP_BODY;
	}
}

