package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeFAOSTATIterator theGeopoliticalEntity = (GeopoliticalEntityCodeFAOSTATIterator)findAncestorWithClass(this, GeopoliticalEntityCodeFAOSTATIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

