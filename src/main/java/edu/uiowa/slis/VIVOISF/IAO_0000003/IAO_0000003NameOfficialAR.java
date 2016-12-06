package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003NameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003NameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003NameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003NameOfficialARIterator theIAO_0000003 = (IAO_0000003NameOfficialARIterator)findAncestorWithClass(this, IAO_0000003NameOfficialARIterator.class);
			pageContext.getOut().print(theIAO_0000003.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

