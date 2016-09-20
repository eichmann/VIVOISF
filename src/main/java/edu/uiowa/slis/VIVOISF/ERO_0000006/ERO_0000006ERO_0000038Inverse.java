package edu.uiowa.slis.VIVOISF.ERO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000006ERO_0000038Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000006ERO_0000038Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000006ERO_0000038Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000006ERO_0000038InverseIterator theERO_0000006ERO_0000038InverseIterator = (ERO_0000006ERO_0000038InverseIterator)findAncestorWithClass(this, ERO_0000006ERO_0000038InverseIterator.class);
			pageContext.getOut().print(theERO_0000006ERO_0000038InverseIterator.getERO_0000038Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000006 for ERO_0000038 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000006 for ERO_0000038 tag ");
		}
		return SKIP_BODY;
	}
}

