package edu.uiowa.slis.VIVOISF.ARG_2000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000008IAO_0000221Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000008IAO_0000221Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000008IAO_0000221Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000008IAO_0000221Iterator theARG_2000008IAO_0000221Iterator = (ARG_2000008IAO_0000221Iterator)findAncestorWithClass(this, ARG_2000008IAO_0000221Iterator.class);
			pageContext.getOut().print(theARG_2000008IAO_0000221Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000008 for IAO_0000221 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000008 for IAO_0000221 tag ");
		}
		return SKIP_BODY;
	}
}

