package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianRecipientInverseIterator theEmeritusLibrarianRecipientInverseIterator = (EmeritusLibrarianRecipientInverseIterator)findAncestorWithClass(this, EmeritusLibrarianRecipientInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for recipient tag ");
		}
		return SKIP_BODY;
	}
}

