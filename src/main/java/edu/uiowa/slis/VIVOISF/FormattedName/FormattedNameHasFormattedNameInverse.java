package edu.uiowa.slis.VIVOISF.FormattedName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FormattedNameHasFormattedNameInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FormattedNameHasFormattedNameInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FormattedNameHasFormattedNameInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FormattedNameHasFormattedNameInverseIterator theFormattedNameHasFormattedNameInverseIterator = (FormattedNameHasFormattedNameInverseIterator)findAncestorWithClass(this, FormattedNameHasFormattedNameInverseIterator.class);
			pageContext.getOut().print(theFormattedNameHasFormattedNameInverseIterator.getHasFormattedNameInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for hasFormattedName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for hasFormattedName tag ");
		}
		return SKIP_BODY;
	}
}

