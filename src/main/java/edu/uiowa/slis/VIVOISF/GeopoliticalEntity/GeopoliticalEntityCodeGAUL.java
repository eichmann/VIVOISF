package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeGAULIterator theGeopoliticalEntity = (GeopoliticalEntityCodeGAULIterator)findAncestorWithClass(this, GeopoliticalEntityCodeGAULIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

