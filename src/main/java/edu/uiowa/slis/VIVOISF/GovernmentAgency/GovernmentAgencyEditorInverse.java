package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyEditorInverseIterator theGovernmentAgencyEditorInverseIterator = (GovernmentAgencyEditorInverseIterator)findAncestorWithClass(this, GovernmentAgencyEditorInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for editor tag ");
		}
		return SKIP_BODY;
	}
}

