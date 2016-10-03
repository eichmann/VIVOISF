package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumPerformerInverseIterator theMuseumPerformerInverseIterator = (MuseumPerformerInverseIterator)findAncestorWithClass(this, MuseumPerformerInverseIterator.class);
			pageContext.getOut().print(theMuseumPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for performer tag ");
		}
		return SKIP_BODY;
	}
}

