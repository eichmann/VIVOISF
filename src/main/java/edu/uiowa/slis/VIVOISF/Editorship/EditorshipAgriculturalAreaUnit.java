package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipAgriculturalAreaUnitIterator theEditorship = (EditorshipAgriculturalAreaUnitIterator)findAncestorWithClass(this, EditorshipAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theEditorship.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

