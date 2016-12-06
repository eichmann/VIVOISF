package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipPopulationUnitIterator theEditorship = (EditorshipPopulationUnitIterator)findAncestorWithClass(this, EditorshipPopulationUnitIterator.class);
			pageContext.getOut().print(theEditorship.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

