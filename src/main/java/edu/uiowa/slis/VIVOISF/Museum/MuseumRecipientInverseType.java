package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumRecipientInverseIterator theMuseumRecipientInverseIterator = (MuseumRecipientInverseIterator)findAncestorWithClass(this, MuseumRecipientInverseIterator.class);
			pageContext.getOut().print(theMuseumRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for recipient tag ");
		}
		return SKIP_BODY;
	}
}

