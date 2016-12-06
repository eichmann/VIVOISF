package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030CodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030CodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030CodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030CodeDBPediaIDIterator theIAO_0000030 = (IAO_0000030CodeDBPediaIDIterator)findAncestorWithClass(this, IAO_0000030CodeDBPediaIDIterator.class);
			pageContext.getOut().print(theIAO_0000030.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

