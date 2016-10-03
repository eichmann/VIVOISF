package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualIdentifierIterator theManual = (ManualIdentifierIterator)findAncestorWithClass(this, ManualIdentifierIterator.class);
			pageContext.getOut().print(theManual.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for identifier tag ");
		}
		return SKIP_BODY;
	}
}

