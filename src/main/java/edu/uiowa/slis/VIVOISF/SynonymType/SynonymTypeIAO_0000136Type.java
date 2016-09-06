package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeIAO_0000136Iterator theSynonymTypeIAO_0000136Iterator = (SynonymTypeIAO_0000136Iterator)findAncestorWithClass(this, SynonymTypeIAO_0000136Iterator.class);
			pageContext.getOut().print(theSynonymTypeIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

