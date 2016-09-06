package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountIAO_0000221Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountIAO_0000221Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountIAO_0000221Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountIAO_0000221Iterator theGlobalCitationCountIAO_0000221Iterator = (GlobalCitationCountIAO_0000221Iterator)findAncestorWithClass(this, GlobalCitationCountIAO_0000221Iterator.class);
			pageContext.getOut().print(theGlobalCitationCountIAO_0000221Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for IAO_0000221 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for IAO_0000221 tag ");
		}
		return SKIP_BODY;
	}
}

