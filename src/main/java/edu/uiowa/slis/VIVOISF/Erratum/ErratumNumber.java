package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumNumberIterator theErratum = (ErratumNumberIterator)findAncestorWithClass(this, ErratumNumberIterator.class);
			pageContext.getOut().print(theErratum.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for number tag ");
		}
		return SKIP_BODY;
	}
}

