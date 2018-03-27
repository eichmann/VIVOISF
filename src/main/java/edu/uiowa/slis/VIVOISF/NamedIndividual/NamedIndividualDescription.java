package edu.uiowa.slis.VIVOISF.NamedIndividual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NamedIndividualDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NamedIndividualDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(NamedIndividualDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NamedIndividualDescriptionIterator theNamedIndividual = (NamedIndividualDescriptionIterator)findAncestorWithClass(this, NamedIndividualDescriptionIterator.class);
			pageContext.getOut().print(theNamedIndividual.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing NamedIndividual for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for description tag ");
		}
		return SKIP_BODY;
	}
}

