package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumEditionIterator theErratum = (ErratumEditionIterator)findAncestorWithClass(this, ErratumEditionIterator.class);
			pageContext.getOut().print(theErratum.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for edition tag ");
		}
		return SKIP_BODY;
	}
}

