package edu.uiowa.slis.VIVOISF.IAO_0000027;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000027TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000027TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000027TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000027TranslatorIterator theIAO_0000027TranslatorIterator = (IAO_0000027TranslatorIterator)findAncestorWithClass(this, IAO_0000027TranslatorIterator.class);
			pageContext.getOut().print(theIAO_0000027TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000027 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000027 for translator tag ");
		}
		return SKIP_BODY;
	}
}

