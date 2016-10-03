package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumIdentifierIterator theErratum = (ErratumIdentifierIterator)findAncestorWithClass(this, ErratumIdentifierIterator.class);
			pageContext.getOut().print(theErratum.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for identifier tag ");
		}
		return SKIP_BODY;
	}
}

