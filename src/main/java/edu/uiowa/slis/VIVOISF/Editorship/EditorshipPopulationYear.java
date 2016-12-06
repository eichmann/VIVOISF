package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipPopulationYearIterator theEditorship = (EditorshipPopulationYearIterator)findAncestorWithClass(this, EditorshipPopulationYearIterator.class);
			pageContext.getOut().print(theEditorship.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

