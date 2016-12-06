package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(areaAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			if (!thearea.commitNeeded) {
				pageContext.getOut().print(thearea.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing area for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			return thearea.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing area for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			thearea.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing area for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for abbreviation tag ");
		}
	}
}

