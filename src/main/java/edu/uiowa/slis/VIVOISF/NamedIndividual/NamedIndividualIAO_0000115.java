package edu.uiowa.slis.VIVOISF.NamedIndividual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NamedIndividualIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NamedIndividualIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(NamedIndividualIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NamedIndividualIAO_0000115Iterator theNamedIndividual = (NamedIndividualIAO_0000115Iterator)findAncestorWithClass(this, NamedIndividualIAO_0000115Iterator.class);
			pageContext.getOut().print(theNamedIndividual.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing NamedIndividual for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

