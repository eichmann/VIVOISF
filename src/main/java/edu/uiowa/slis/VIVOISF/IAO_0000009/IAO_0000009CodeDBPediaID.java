package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009CodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009CodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009CodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009CodeDBPediaIDIterator theIAO_0000009 = (IAO_0000009CodeDBPediaIDIterator)findAncestorWithClass(this, IAO_0000009CodeDBPediaIDIterator.class);
			pageContext.getOut().print(theIAO_0000009.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

