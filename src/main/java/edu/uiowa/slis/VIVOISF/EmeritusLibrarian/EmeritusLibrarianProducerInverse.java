package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianProducerInverseIterator theEmeritusLibrarianProducerInverseIterator = (EmeritusLibrarianProducerInverseIterator)findAncestorWithClass(this, EmeritusLibrarianProducerInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for producer tag ");
		}
		return SKIP_BODY;
	}
}

