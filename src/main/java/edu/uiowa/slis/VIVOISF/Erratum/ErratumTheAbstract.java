package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumTheAbstractIterator theErratum = (ErratumTheAbstractIterator)findAncestorWithClass(this, ErratumTheAbstractIterator.class);
			pageContext.getOut().print(theErratum.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

