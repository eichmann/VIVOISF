package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipLandAreaUnitIterator theEditorship = (EditorshipLandAreaUnitIterator)findAncestorWithClass(this, EditorshipLandAreaUnitIterator.class);
			pageContext.getOut().print(theEditorship.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

