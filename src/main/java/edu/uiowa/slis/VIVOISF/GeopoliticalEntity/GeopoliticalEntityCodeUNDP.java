package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeUNDPIterator theGeopoliticalEntity = (GeopoliticalEntityCodeUNDPIterator)findAncestorWithClass(this, GeopoliticalEntityCodeUNDPIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

