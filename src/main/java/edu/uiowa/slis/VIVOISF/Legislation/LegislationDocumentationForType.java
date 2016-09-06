package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationDocumentationForIterator theLegislationDocumentationForIterator = (LegislationDocumentationForIterator)findAncestorWithClass(this, LegislationDocumentationForIterator.class);
			pageContext.getOut().print(theLegislationDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

