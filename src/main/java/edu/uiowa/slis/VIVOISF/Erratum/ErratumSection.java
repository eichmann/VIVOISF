package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumSectionIterator theErratum = (ErratumSectionIterator)findAncestorWithClass(this, ErratumSectionIterator.class);
			pageContext.getOut().print(theErratum.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for section tag ");
		}
		return SKIP_BODY;
	}
}

