package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyEditorInverseIterator theGovernmentAgencyEditorInverseIterator = (GovernmentAgencyEditorInverseIterator)findAncestorWithClass(this, GovernmentAgencyEditorInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for editor tag ");
		}
		return SKIP_BODY;
	}
}

